package in.codingstreams.etexpenseservice.controller.mapper;

import in.codingstreams.etexpenseservice.controller.model.ExpenseDto;
import in.codingstreams.etexpenseservice.controller.model.ExpenseRequestDto;
import in.codingstreams.etexpenseservice.data.model.Expense;
import in.codingstreams.etexpenseservice.service.model.ExpenseRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExpenseMapper {
  ExpenseMapper INSTANCE = Mappers.getMapper(ExpenseMapper.class);

  ExpenseRequest toExpenseRequest(ExpenseRequestDto expenseRequestDto);
  ExpenseDto toExpenseDto(Expense expense);
}
