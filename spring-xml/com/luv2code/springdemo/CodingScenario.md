# Inversion of Control
We have two apps. My app and basball coach.
My app wants to get their daily workout from the basball coach.
WAIT
Now that app has to be able to easily change the coach to a coach of another sport

# Dependency Injection
Now our Coach will also provide daily fortunes
New helper FortuneService - this is a dependency.
After that we want to inject thr string team name and the coach's email into the coach object

## Practice 2
1.Define a new imp for FortuneService
2.getFortune return a random fortune.
3.inject new dependency
4.test it

## Practice 3
1. Add bean to your new coach implmentation
2.test singleton
3.verify bean scope is being applied
