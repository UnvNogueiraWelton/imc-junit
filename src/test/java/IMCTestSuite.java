import IMC.AdultIMC;
import IMC.FemaleElderlyIMC;
import IMC.MaleElderlyIMC;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
    Baixo peso: entre 17 e 18,49 kg/m².
    Peso normal: entre 18,50 e 24,99 kg/m².
    Sobrepeso: entre 25 e 29,99 kg/m².
    Obesidade grau I: entre 30 e 34,99 kg/m².
    Obesidade grau II: entre 35 e 39,99 kg/m².
    Obesidade grau III (obesidade mórbida): maior que 40 kg/m²
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({AdultIMC.class, FemaleElderlyIMC.class, MaleElderlyIMC.class})
class IMCTestSuite {

}
