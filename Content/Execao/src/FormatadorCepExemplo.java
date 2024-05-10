public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = fromatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static String fromatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }
}
