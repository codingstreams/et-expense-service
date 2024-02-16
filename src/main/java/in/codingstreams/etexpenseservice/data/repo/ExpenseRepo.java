package in.codingstreams.etexpenseservice.data.repo;

import in.codingstreams.etexpenseservice.data.model.Expense;
import in.codingstreams.etexpenseservice.data.model.ExpenseId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepo extends MongoRepository<Expense, ExpenseId> {
}
