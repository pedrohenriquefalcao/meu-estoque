package com.meuestoque.repository;

import com.meuestoque.model.Lote;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class LoteRepository {

    public void salvar(Lote lote) {
        String sql = "INSERT INTO lote (data_feito, data_prazo) VALUES (?, ?)";

        try (Connection conn = ConexaoDatabase.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDate(1, Date.valueOf(lote.getDataFeito()));
            stmt.setDate(2, Date.valueOf(lote.getDataPrazo()));

            stmt.executeUpdate();
            System.out.println("Sucesso!! Lote registrado no estoque.");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar o lote no banco de dados!");
            e.printStackTrace();
        }
    }
}