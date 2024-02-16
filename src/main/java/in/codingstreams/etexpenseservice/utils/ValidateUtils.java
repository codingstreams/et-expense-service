package in.codingstreams.etexpenseservice.utils;

import in.codingstreams.etexpenseservice.controller.model.ExpenseRequestDto;
import in.codingstreams.etexpenseservice.controller.model.RequestType;

public class ValidateUtils {
  private ValidateUtils() {
  }

  public boolean validateExpenseRequest(ExpenseRequestDto expenseRequestDto, RequestType requestType) {
    return switch (requestType) {
      case ADD_EXPENSE -> validateAddExpenseRequest(expenseRequestDto);
      case DELETE_EXPENSE -> validateDeleteExpenseRequest(expenseRequestDto);
      default -> false;
    };
  }

  private boolean validateDeleteExpenseRequest(ExpenseRequestDto expenseRequestDto) {
    return false;
  }

  private boolean validateAddExpenseRequest(ExpenseRequestDto expenseRequestDto) {
    return false;
  }
}
