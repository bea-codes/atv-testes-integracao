package com.example.atendimento;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoService {
    private List<Atendimento> listaAtendimentos;

    public AtendimentoService() {
        this.listaAtendimentos = new ArrayList<>();
    }

    // adicionar atendimento
    public void adicionarAtendimento(Atendimento atendimento) {
        this.listaAtendimentos.add(atendimento);
        System.out.println("Atendimento adicionado com sucesso: " + atendimento);
    }

    // atualizar atendimento
    public void atualizarAtendimento(Atendimento atendimentoAntigo, Atendimento atendimentoNovo) {
        if (this.listaAtendimentos.contains(atendimentoAntigo)) {
            this.listaAtendimentos.remove(atendimentoAntigo);
            this.listaAtendimentos.add(atendimentoNovo);
            System.out.println("Atendimento atualizado com sucesso. Novo atendimento: " + atendimentoNovo);
        } else {
            System.out.println("Atendimento não encontrado para atualização.");
        }
    }

    // remover atendimento
    public void removerAtendimento(Atendimento atendimento) {
        if (this.listaAtendimentos.contains(atendimento)) {
            this.listaAtendimentos.remove(atendimento);
            System.out.println("Atendimento removido com sucesso: " + atendimento);
        } else {
            System.out.println("Atendimento não encontrado para remoção.");
        }
    }

    // obter a lista de atendimentos
    public List<Atendimento> getListaAtendimentos() {
        return listaAtendimentos;
    }
}
