package in.codingstreams.etexpenseservice.controller.mapper;

import in.codingstreams.etexpenseservice.controller.model.ExpenseCategoryDto;
import in.codingstreams.etexpenseservice.controller.model.ExpenseCategoryRequestDto;
import in.codingstreams.etexpenseservice.data.model.ExpenseCategory;
import in.codingstreams.etexpenseservice.service.model.ExpenseCategoryRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExpenseCategoryMapper {
  ExpenseCategoryMapper INSTANCE = Mappers.getMapper(ExpenseCategoryMapper.class);

  ExpenseCategoryRequest toExpenseCategoryRequest(ExpenseCategoryRequestDto expenseCategoryRequestDto);
  ExpenseCategoryDto toExpenseCategoryDto(ExpenseCategory expenseCategory);
}
