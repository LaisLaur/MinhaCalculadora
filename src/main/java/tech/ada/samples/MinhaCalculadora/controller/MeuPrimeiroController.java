package tech.ada.samples.MinhaCalculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
//http://localhost:8080/v1
public class MeuPrimeiroController {

    @GetMapping (path = "/ola/{nome}")
    //http://localhost:8080/v1/ola/nomeX
    public String ola (@PathVariable("nome") String nomeParametro){
        return String.format("Olá, %s", nomeParametro);
    }

    @GetMapping (path = "/soma/{first}/{second}")
    //http://localhost:8080/v1/soma/nºx/nºy
    public Integer somaValores(@PathVariable("first") Integer primeiro, @PathVariable("second") Integer segundo){
        return primeiro+segundo;
    }

    @GetMapping (path = "/subtracao/{first}/{second}")
    //http://localhost:8080/v1/subtracao/nºx/nºy
    public Integer subtraiValores(@PathVariable("first") Integer primeiro, @PathVariable("second") Integer segundo){
        return primeiro-segundo;
    }

    @GetMapping (path = "/multiplicacao/{first}/{second}")
    //http://localhost:8080/v1/multiplicacao/nºx/nºy
    public Integer multiplicaValores(@PathVariable("first") Integer primeiro, @PathVariable("second") Integer segundo){
        return primeiro*segundo;
    }

    @GetMapping (path = "/divisao/{first}/{second}")
    //http://localhost:8080/v1/divisao/nºx/nºy
    public Integer divideValores(@PathVariable("first") Integer primeiro, @PathVariable("second") Integer segundo){
        return primeiro/segundo;
    }

}
