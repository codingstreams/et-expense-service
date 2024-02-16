package in.codingstreams.etexpenseservice.controller;

import in.codingstreams.etexpenseservice.controller.mapper.ExpenseCategoryMapper;
import in.codingstreams.etexpenseservice.controller.model.ExpenseCategoryDto;
import in.codingstreams.etexpenseservice.controller.model.ExpenseCategoryRequestDto;
import in.codingstreams.etexpenseservice.service.expensecategory.ExpenseCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class ExpenseCategoryController {
  private final ExpenseCategoryService expenseCategoryService;

  @PostMapping("/")
  public ResponseEntity<ExpenseCategoryDto> addExpenseCategory(
      @RequestBody ExpenseCategoryRequestDto expenseCategoryRequestDto
  ) {
    var expenseCategory = expenseCategoryService.addExpenseCategory(
        ExpenseCategoryMapper.INSTANCE.toExpenseCategoryRequest(expenseCategoryRequestDto)
    );

    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(
            ExpenseCategoryMapper.INSTANCE.toExpenseCategoryDto(expenseCategory)
        );
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<ExpenseCategoryDto> deleteExpenseCategory(
      @PathVariable String id,
      @RequestBody ExpenseCategoryRequestDto expenseCategoryRequestDto
  ) {
    var expenseCategory = expenseCategoryService.deleteExpenseCategory(
        ExpenseCategoryMapper.INSTANCE.toExpenseCategoryRequest(expenseCategoryRequestDto)
    );

    return ResponseEntity
        .status(HttpStatus.OK)
        .body(
            ExpenseCategoryMapper.INSTANCE.toExpenseCategoryDto(expenseCategory)
        );
  }
}
