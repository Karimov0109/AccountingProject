package com.ilm.uz.accountingproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDTO {

    private Date transactionDate;
    private String comment;
}
