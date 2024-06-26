package br.com.fiap.tc.sistema.parquimetro.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "recibo")
public class Recibo {
    @Id
    private String id;
    @DBRef
    private Veiculo veiculo;
    private LocalDateTime entrada;
    private LocalDateTime saida;
}
