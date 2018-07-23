package com.template;

import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.Contract;
import net.corda.core.transactions.LedgerTransaction;
import net.corda.core.crypto.SecureHash;

/**
 * Define your contract here.
 */
public class CommercialPaper implements Contract {
    // This is used to identify our contract when building a transaction.
    public static final String TEMPLATE_CONTRACT_ID = "com.template.CommercialPaper";

    //@Override
    public SecureHash getLegalContractReference() {
        return SecureHash.Companion.sha256("https://en.wikipedia.org/wiki/Commercial_paper");
    }

    /**
     * A transaction is considered valid if the verify() function of the contract of each of the
     * transaction's input
     * and output states does not throw an exception.
     */
    @Override
    public void verify(LedgerTransaction tx) {
        throw new UnsupportedOperationException();
    }
 //   public interface Commands extends CommandData {
  //      class Action implements Commands {}
   // }
}