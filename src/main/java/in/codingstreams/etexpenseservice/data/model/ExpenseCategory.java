package in.codingstreams.etexpenseservice.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "expense_categories")
public class ExpenseCategory {
  @Id
  private ExpenseCategoryId id;
  private String name;
  @CreatedDate
  private LocalDateTime date;
  @LastModifiedDate
  private LocalDateTime modifiedAt;
}
