package IMC;

import org.example.controller.IMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdultIMC {
    private IMC imc;

    @Before
    public void setup() {
        this.imc = new IMC();
    }

    @Test
    public void baixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", imc.calc(48.0, 1.74, 20, "male"));
    }

    @Test
    public void baixoPesoGraveLimiteInferior() {
        Assert.assertEquals("Baixo peso grave", imc.calc(49.0, 1.75, 65, "male"));
    }

    @Test
    public void baixoPesoGraveLimiteSuperior() {
        Assert.assertEquals("Baixo peso grave", imc.calc(52.0, 1.75, 65, "male"));
    }

    @Test
    public void baixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", imc.calc(47.0, 1.66, 65, "male"));
    }

    @Test
    public void baixoPesoLimiteSuperior() {
        Assert.assertEquals("Baixo peso", imc.calc(52.0, 1.68, 65, "male"));
    }

    @Test
    public void pesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", imc.calc(53.0, 1.69, 65, "male"));
    }

    @Test
    public void pesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", imc.calc(73.0, 1.71, 65, "male"));
    }

    @Test
    public void sobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", imc.calc(71.0, 1.68, 65, "male"));
    }

    @Test
    public void sobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", imc.calc(84.0, 1.68, 65, "male"));
    }

    @Test
    public void obesidadeGrau1LimiteInferior() {
        Assert.assertEquals("Obesidade grau I", imc.calc(85.0, 1.68, 65, "male"));
    }

    @Test
    public void obesidadeGrau1LimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", imc.calc(98.0, 1.68, 65, "male"));
    }

    @Test
    public void obesidadeGrau2LimiteInferior() {
        Assert.assertEquals("Obesidade grau II", imc.calc(99.0, 1.68, 65, "male"));
    }

    @Test
    public void obesidadeGrau2LimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", imc.calc(112, 1.68, 65, "male"));
    }

    @Test
    public void obesidadeGrau3LimiteSuperior() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", imc.calc(113, 1.68, 65, "male"));
    }
}
