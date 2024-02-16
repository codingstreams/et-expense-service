package in.codingstreams.etexpenseservice.controller;

import in.codingstreams.etexpenseservice.controller.mapper.ExpenseMapper;
import in.codingstreams.etexpenseservice.controller.model.ExpenseDto;
import in.codingstreams.etexpenseservice.controller.model.ExpenseRequestDto;
import in.codingstreams.etexpenseservice.service.expense.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {
  private final ExpenseService expenseService;

  @PostMapping("/")
  public ResponseEntity<ExpenseDto> addExpense(
      @RequestBody ExpenseRequestDto expenseRequestDto
  ) {

    var expense = expenseService.addExpense(
        ExpenseMapper.INSTANCE.toExpenseRequest(expenseRequestDto)
    );

    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(
            ExpenseMapper.INSTANCE.toExpenseDto(expense)
        );
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<ExpenseDto> deleteExpense(
      @PathVariable String id,
      @RequestBody ExpenseRequestDto expenseRequestDto
  ) {
    var expense = expenseService.addExpense(
        ExpenseMapper.INSTANCE.toExpenseRequest(expenseRequestDto)
    );

    return ResponseEntity
        .status(HttpStatus.OK)
        .body(
            ExpenseMapper.INSTANCE.toExpenseDto(expense)
        );
  }
}
