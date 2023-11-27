package com.bakery.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.bakery.demo.dtos.ProductDTO;
import com.bakery.demo.model.Venda;
import com.bakery.demo.repository.Base.BaseRepository;

public interface VendaRepository extends BaseRepository<Venda> {
    @Query(value = "select p2.codpro as codpro, p2.nompro as nompro , p2.vlrpro as vlrpro, p2.vldpro as vldpro, p2.qtdest as qtdest, p2.codenc as codenc, p2.codcli as codcli from produtovenda p \r\n"
            + //
            "left join produto p2 on p.codpro =  p2.codpro \r\n" + //
            "left join venda v1 on v1.codven = p.codven \r\n" + //
            "left join cliente c1 on v1.codcli = c1.codcli \r\n" + //
            "where p.codven = ?", nativeQuery = true)
    public List<ProductDTO> findSellWithProducts(Integer codven);
}
