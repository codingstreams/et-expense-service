package in.codingstreams.etexpenseservice.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "expenses")
public class Expense {
  @Id
  private ExpenseId id;
  private String title;
  private String amount;

  @DocumentReference
  private ExpenseCategory expenseCategory;

  @CreatedDate
  private LocalDateTime date;

  @LastModifiedDate
  private LocalDateTime modifiedAt;
}
