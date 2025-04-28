package abstractFactory;
import org.example.abstractFactory.FabricaPessoaFisica;
import org.example.abstractFactory.FabricaPessoaJuridica;
import org.example.abstractFactory.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTeste{

    @Test
    public void perguntarMarco(){
        Pessoa.getInstance().setContrato(new FabricaPessoaFisica());
        String experado = "Contrato de Pessoa Física";
        String contratoEmitido = Pessoa.getInstance().emitirContrato();
        assertEquals(experado, contratoEmitido);
    }

    @Test
    public void emitirContratoPessoaFisica(){
        Pessoa.getInstance().setContrato(new FabricaPessoaFisica());
        assertEquals("Contrato de Pessoa Física", Pessoa.getInstance().emitirContrato());
    }

    @Test
    public void emitirContratoPessoaJuridica(){
        Pessoa.getInstance().setContrato(new FabricaPessoaJuridica());
        assertEquals("Contrato de Pessoa Jurídica", Pessoa.getInstance().emitirContrato());
    }

    @Test
    public void emitirProcessoPessoaFisica(){
        Pessoa.getInstance().setProcesso(new FabricaPessoaFisica());
        assertEquals("Processo de Pessoa Física", Pessoa.getInstance().emitirProcesso());
    }

    @Test
    public void emitirProcessoPessoaJuridica(){
        Pessoa.getInstance().setProcesso(new FabricaPessoaJuridica());
        assertEquals("Processo de Pessoa Jurídica", Pessoa.getInstance().emitirProcesso());
    }

}
