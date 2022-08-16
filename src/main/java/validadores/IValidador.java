package validadores;

import model.Pedido;

import java.io.IOException;

public interface IValidador {
   boolean iValidador(Pedido pedido) throws IOException;

}
