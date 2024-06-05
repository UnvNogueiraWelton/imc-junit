package IMC;

import org.example.controller.IMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaleElderlyIMC {
    private IMC imc;

    @Before
    public void setup() {
        this.imc = new IMC();
    }

    @Test
    public void baixoPeso() {
        Assert.assertEquals("Baixo peso", imc.calc(61.0, 1.68, 66, "male"));
    }

    @Test
    public void pesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", imc.calc(63.0, 1.68, 66, "male"));
    }

    @Test
    public void pesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", imc.calc(76.0, 1.68, 66, "male"));
    }

    @Test
    public void sobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", imc.calc(77.0, 1.68, 66, "male"));
    }

    @Test
    public void sobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", imc.calc(84.0, 1.68, 66, "male"));
    }

    @Test
    public void obesidadeGrau1LimiteInferior() {
        Assert.assertEquals("Obesidade grau I", imc.calc(85.0, 1.68, 66, "male"));
    }

    @Test
    public void obesidadeGrau1LimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", imc.calc(98.0, 1.68, 66, "male"));
    }

    @Test
    public void obesidadeGrau2LimiteInferior() {
        Assert.assertEquals("Obesidade grau II", imc.calc(101.0, 1.69, 66, "male"));
    }

    @Test
    public void obesidadeGrau2LimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", imc.calc(114.0, 1.69, 66, "male"));
    }

    @Test
    public void obesidadeGrau3LimiteSuperior() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", imc.calc(115.0, 1.69, 66, "male"));
    }
}
