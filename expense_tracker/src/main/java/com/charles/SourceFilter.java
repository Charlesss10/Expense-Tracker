package com.charles;

import java.sql.SQLException;
import java.util.Date;

//Filter by source
public class SourceFilter implements FilterStrategy {

    @Override
    public void filter(double amountFilterStart, double amountFilterEnd, Date dateFilterStart,
            Date dateFilterEnd,
            String categoryFilter, String sourceFilter, TransactionManager transactionManager) throws SQLException {
        transactionManager.getRecentTransactions(amountFilterStart, amountFilterEnd, dateFilterStart, dateFilterEnd,
                categoryFilter,
                sourceFilter);
    }
}
