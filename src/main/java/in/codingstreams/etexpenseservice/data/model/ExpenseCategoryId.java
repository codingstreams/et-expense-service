package in.codingstreams.etexpenseservice.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseCategoryId {
  private String categoryId;
  private String userId;
}
