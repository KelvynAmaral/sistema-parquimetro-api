package br.com.fiap.tc.sistema.parquimetro.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "veiculo")
public class Veiculo {
    @Id
    private String id;
    @NonNull
    private String placa;
    @NonNull
    private String tipo;
    @DBRef
    private List<Recibo> recibos = new ArrayList<>();
}
