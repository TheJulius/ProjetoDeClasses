package carro;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class JSONWrite {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Freio freio = new Freio("brembo", "ceramica");
		Suspensao sus = new Suspensao(1.5, "esportiva");
		Roda roda =  new Roda(17);
		Motor motor = new Motor(2.0);
		Carro carro = new Carro("Ford Ranger", 2012, 52.500); 
		
		roda.trocarPecas(sus, freio);
		motor.ligarDesligar(0);
		carro.juntarPecas(motor, roda);
		
		//Cria um Objeto JSON
		JSONObject jsonObject = new JSONObject();

		FileWriter writeFile = null;

		//Armazena dados em um Objeto JSON
		jsonObject.put(freio, sus);
		jsonObject.put(roda, motor);
		jsonObject.put(carro, carro);
		
		
		try{
			writeFile = new FileWriter("carro.json");
			//Escreve no arquivo conteudo do Objeto JSON
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(jsonObject);

	}

}
