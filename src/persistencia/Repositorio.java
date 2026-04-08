package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Repositorio {

    public void gravar(List concessionarias) throws IOException {
        FileOutputStream saidaArquivo = new FileOutputStream("pedagio.dat");
        ObjectOutputStream saida = new ObjectOutputStream(saidaArquivo);
        saida.writeObject(concessionarias);
    }

    public List ler() throws IOException, ClassNotFoundException {
        FileInputStream entradaArquivo = new FileInputStream("pedagio.dat");
        ObjectInputStream entrada = new ObjectInputStream(entradaArquivo);
        Object concessionarias = entrada.readObject();
        return (List) concessionarias;
    }
}