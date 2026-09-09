package co.edu.unicauca.infoii.correo.componenteRecibirMensajes;

import co.edu.unicauca.infoii.correo.DTOs.CancionAlmacenarDTOInput;
import co.edu.unicauca.infoii.correo.commons.Simulacion;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
    @RabbitListener(queues = "notificaciones_canciones")
    public void receiveMessage(CancionAlmacenarDTOInput objClienteCreado) {
        System.out.println("Datos de la canción recibidos");
        System.out.println("Enviando correo electrónico...");
        Simulacion.simular(10000, "Enviando correo...");
        System.out.println("El correo fue enviado al cliente con los siguientes datos:");
        System.out.println("Título: " + objClienteCreado.getTitulo());
        System.out.println("Artista: " + objClienteCreado.getArtista());
        System.out.println("Género: " + objClienteCreado.getGenero());
    }
}
  