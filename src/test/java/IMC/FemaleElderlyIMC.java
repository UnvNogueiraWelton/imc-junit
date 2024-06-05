package IMC;

import org.example.controller.IMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FemaleElderlyIMC {
    private IMC imc;

    @Before
    public void setup() {
        this.imc = new IMC();
    }

    @Test
    public void baixoPeso() {
        Assert.assertEquals("Baixo peso", imc.calc(61.0, 1.68, 66, "female"));
    }

    @Test
    public void pesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", imc.calc(63.0, 1.68, 66, "female"));
    }

    @Test
    public void pesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", imc.calc(76.0, 1.68, 66, "female"));
    }

    @Test
    public void sobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", imc.calc(77.0, 1.68, 66, "female"));
    }

    @Test
    public void sobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", imc.calc(90.0, 1.68, 66, "female"));
    }

    @Test
    public void obesidadeGrau1LimiteInferior() {
        Assert.assertEquals("Obesidade grau I", imc.calc(91.0, 1.68, 66, "female"));
    }

    @Test
    public void obesidadeGrau1LimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", imc.calc(104.0, 1.68, 66, "female"));
    }

    @Test
    public void obesidadeGrau2LimiteInferior() {
        Assert.assertEquals("Obesidade grau II", imc.calc(106.0, 1.69, 66, "female"));
    }

    @Test
    public void obesidadeGrau2LimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", imc.calc(118.0, 1.68, 66, "female"));
    }

    @Test
    public void obesidadeGrau3LimiteSuperior() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", imc.calc(120.0, 1.69, 66, "female"));
    }
}
