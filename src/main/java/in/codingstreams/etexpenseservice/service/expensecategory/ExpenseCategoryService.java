package in.codingstreams.etexpenseservice.service.expensecategory;

import in.codingstreams.etexpenseservice.data.model.ExpenseCategory;
import in.codingstreams.etexpenseservice.service.model.ExpenseCategoryRequest;
import org.springframework.data.domain.Page;

public interface ExpenseCategoryService {
  ExpenseCategory addExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest);
  ExpenseCategory deleteExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest);
  ExpenseCategory updateExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest);
  Page<ExpenseCategory> getAllExpenseCategories(ExpenseCategoryRequest expenseCategoryRequest);
  ExpenseCategory getExpenseCategoryById(ExpenseCategoryRequest expenseCategoryRequest);
}
