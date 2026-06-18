package com.meuestoque;

import com.meuestoque.model.Sabor;
import com.meuestoque.repository.SaborRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Meu estoque rodando! ===");

        SaborRepository saborRepo = new SaborRepository();

        Sabor brownieBrigadeiro = new Sabor();
        brownieBrigadeiro.setNomeSabor("Brigadeiro");
        saborRepo.salvar(brownieBrigadeiro);

        Sabor brownieMaracuja = new Sabor();
        brownieMaracuja.setNomeSabor("Maracuja");
        saborRepo.salvar(brownieMaracuja);


    }
}
