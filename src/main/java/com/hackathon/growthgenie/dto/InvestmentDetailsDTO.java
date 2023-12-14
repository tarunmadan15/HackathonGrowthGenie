package com.hackathon.growthgenie.dto;

import java.util.List;
import java.util.Map;
import com.hackathon.growthgenie.model.FixedDeposits;
import com.hackathon.growthgenie.model.Loan;
import com.hackathon.growthgenie.model.MutualFunds;
import com.hackathon.growthgenie.model.Stocks;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvestmentDetailsDTO {
  private Integer customerId;
  private String customerName;
  private Map<String, List<Stocks>> stocksDetails;
  private Map<String, List<MutualFunds>> mutualFundDetails;
  private Map<String, List<FixedDeposits>> fixedDepositsDetails;
  private Map<String, List<Loan>> loansDetails;
}
