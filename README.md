# Master Thesis

A framework for optimizing Solidity code in Ethereum Smart Contracts.

## Authors
* **Fioretti Samuele**

## Introduction
Ethereum is the largest blockchain platform that supports smart contracts, running them in its virtual machine. To ensure the successful termination of a smart contract and to prevent abuse of resources, Ethereum charges developers and users of fees, for deploying the contract, and for its execution.

Smart contracts are complete programs that run on blockchains. The Smart Contract fees are calculated according to the gas consumed by the contract for its creation multiplied for the gas Price that the user is willing to pay.
The gas consumed is the unit of measure of the complexity of a Smart Contract and it is related to the dimension of the contract and the amount of information stored in it, so optimizing the code we could have a considerable saving of gas, and therefore of money.

In this work we propose a framework capable of reducing the fees paid by the user for the creation of a smart contract in the Ethereum blockchain.
First, we carry out an analysis of the existing literature concerning contract analysis and optimization frameworks, and on the optimization techniques applicable to a contract.
Below we expose the approach used in the implementation of the framerwork, and we describe how this was implemented.
Finally, we conduct experiments using real case studies to validate the results obtained by optimization.
