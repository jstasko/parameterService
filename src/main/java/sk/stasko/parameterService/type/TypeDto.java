package sk.stasko.parameterService.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import sk.stasko.parameterService.core.BaseDocumentDto;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection= "type")
public class TypeDto extends BaseDocumentDto {
    private String name;
}
