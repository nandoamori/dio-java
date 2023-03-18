package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
    private OnlinePaymentServices onlinePaymentServices;

    public ContractService(OnlinePaymentServices onlinePaymentServices) {
        this.onlinePaymentServices = onlinePaymentServices;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interests = onlinePaymentServices.interest(basicQuota, i);
            double fee = onlinePaymentServices.paymentFee(basicQuota + interests);
            double quota = basicQuota + interests + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
