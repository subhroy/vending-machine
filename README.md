# vending-machine

Problem Stmt:
=============
# Spark Vending machine

Our company is growing very fast with all the new aquisitions. We are trying to cope with all the demand our employees have for food and beverages. 
We estimated that it would be too hard to aquire multiple vending machines and suite them to our needs, therefore we decided to build our own, smarter ones.

You are to help us design such a machine based on the following requirements:
 - It will accept as payment coins of 1,5,10,25 Sparks.
 - A employee can choose from different products SparklingWater(25), SparkPasta(35), Sparksoda(45)
 - A employee changing his mind, can just get a refund of all his Sparks.
 - The vending machine will return the selected spark product and additionally offer the remaining change (if any)
 - The vending machine should have a functionality thru which it can be resupplied with all the needed products.
 - (**BONUS POINTS**) A vending machine should be able to serve requests for more than one user simultaneously. Our hardware will have multiple coin input slots and selection, our software needs to cope with that. We need to avoid having two of our colleagues trying to aquire the last of our SparklingWater at the same time. We need to ensure at least one of them will get it, right ?

### Development
- Use the language you feel most comfortable with
- We need to ensure that any change we do is working, our employees would be dissapointed if we roll out a non-functioning unit, and we do value their opinion. We should employ TDD for this.

### Gotchas:
- maybe the machine does not have enough funds to give back change, or the remaining coins can't accomodate the needed change amount. How do we solve this ?
- how do we ensure proper and efficient locking of our products for multiple users ?
