package com.salesianos.tarea_dto_apartado_2;

import com.salesianos.tarea_dto_apartado_2.dto.ProductoDTO;
import com.salesianos.tarea_dto_apartado_2.model.Categoria;
import com.salesianos.tarea_dto_apartado_2.model.Producto;

public class FakeMain {

    public static void main(String[] args) {

        Categoria categoria = Categoria.builder()
                .id(1L)
                .nombre("Informática")
                .build();

        Producto producto = Producto.builder()
                .id(1L)
                .nombre("Teclado mecánico")
                .desc("Teclado mecánico RGB")
                .pvp(59.99f)
                .images("teclado.jpg")
                .categoria(categoria)
                .build();

        // Testing salida de daots

        ProductoDTO productoDTO = ProductoDTO.of(producto);
        System.out.println(productoDTO);
    }
}
