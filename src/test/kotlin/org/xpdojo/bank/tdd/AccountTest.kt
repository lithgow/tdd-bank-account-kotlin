package org.xpdojo.bank.tdd

import io.kotest.core.spec.style.FreeSpec

/**
 * Requirements:
 *  I can Deposit money to accounts
 *  I can Withdraw money from accounts
 *  I can Transfer amounts between accounts (if I have the funds)
 *  I can print out an Account balance slip (date, time, balance)
 *  I can print a statement of account activity (statement)
 *  I can apply Statement filters (include just deposits, withdrawal, date)
 */
class AccountTest : FreeSpec({

    "With an account we can" - {
        "!deposit an amount to increase the balance" - {
            TODO("Implement a failing test, make it pass, refactor ...")
        }
    }
})