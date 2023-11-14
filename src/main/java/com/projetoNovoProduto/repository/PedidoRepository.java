package com.projetoNovoProduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoNovoProduto.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
