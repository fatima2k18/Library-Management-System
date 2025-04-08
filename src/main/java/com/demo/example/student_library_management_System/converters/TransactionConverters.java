package com.demo.example.student_library_management_System.converters;

import com.demo.example.student_library_management_System.model.Transaction;
import com.demo.example.student_library_management_System.requestdto.TransactionRequestDto;

public class TransactionConverters {
    public static Transaction convertTransactionRequestDtoIntoTransaction(TransactionRequestDto transactionDto){
        Transaction transaction=new Transaction();
        transaction.setTransactionType(transaction.getTransactionType());
        transaction.setDueDate(transactionDto.getDueDate());
        transaction.setFine(transactionDto.getFine());
        return transaction;
    }
}
