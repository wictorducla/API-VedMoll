package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {
    public DadosDetalhamentoMedico (Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
