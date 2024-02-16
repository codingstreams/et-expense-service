package in.codingstreams.etexpenseservice.service.expense;

import in.codingstreams.etexpenseservice.data.model.Expense;
import in.codingstreams.etexpenseservice.service.model.ExpenseRequest;
import org.springframework.data.domain.Page;

public interface ExpenseService {
  Expense addExpense(ExpenseRequest expenseRequest);
  Expense deleteExpense(ExpenseRequest expenseRequest);
  Expense updateExpense(ExpenseRequest expenseRequest);
  Page<Expense> getAllExpenses(ExpenseRequest expenseRequest);
  Expense getExpenseById(ExpenseRequest expenseRequest);
}
