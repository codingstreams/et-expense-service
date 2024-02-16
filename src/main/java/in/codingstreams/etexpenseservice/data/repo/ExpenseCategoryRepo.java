package in.codingstreams.etexpenseservice.data.repo;

import in.codingstreams.etexpenseservice.data.model.ExpenseCategory;
import in.codingstreams.etexpenseservice.data.model.ExpenseCategoryId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseCategoryRepo extends MongoRepository<ExpenseCategory, ExpenseCategoryId> {
}
