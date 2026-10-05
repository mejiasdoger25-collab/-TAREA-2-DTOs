package com.salesianos.tarea_dto_apartado_2.dto;

import com.salesianos.tarea_dto_apartado_2.model.Categoria;
import com.salesianos.tarea_dto_apartado_2.model.Producto;
import org.springframework.util.CollectionUtils;

public record ProductoDTO(
        //Long id,
        String nombre,
        //String desc,
        float pvp,
        String imagenes
        //Categoria categoria
) {
    public static ProductoDTO of(Producto producto){
        if (producto == null){
            return null;
        }
        return new ProductoDTO(
                producto.getNombre(),
                producto.getPvp(),
                //producto.getImages().get(0),
                //CollectionUtils.isEmpty(producto.getImages()) ? null : producto.getImages()
                producto.getImages() == null || producto.getImages().isBlank() ? null : producto.getImages()
                //producto.getCategoria() != null ? producto.getCategoria().getNombre() : null
        );
    }
}
