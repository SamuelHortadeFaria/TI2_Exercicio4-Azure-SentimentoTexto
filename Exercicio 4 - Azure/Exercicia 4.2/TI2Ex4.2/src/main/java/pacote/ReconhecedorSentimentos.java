package pacote;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.core.credential.AzureKeyCredential;

public class ReconhecedorSentimentos {
    public static void main(String[] args) {
    	
        String chave = "bc5756634870419e9f63ffe4299dfe9a";
        String endpoint = "https://ti2qex4.cognitiveservices.azure.com/";

        TextAnalyticsClient client = new TextAnalyticsClientBuilder()
            .credential(new AzureKeyCredential(chave))
            .endpoint(endpoint)
            .buildClient();

        String texto = "Eu amo Ciencia da Computacao :)))))))))))))))))))))))).";
        com.azure.ai.textanalytics.models.DocumentSentiment resultado = client.analyzeSentiment(texto);
        
        System.out.println("\n------------VERIFICANDO SENTIMENTO DO TEXTO---------------------");
        System.out.println("Texto inserido: " + texto);
        System.out.println("Sentimento:" + resultado.getSentiment());
        System.out.println("----------------------------------------------------------------");
        
    }
}
