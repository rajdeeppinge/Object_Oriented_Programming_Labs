import random

N = 100
print N
bracket1 = ['{', '[', '<', '(']
bracket2 = ['}', ']', '>', ')']
brackets = ['{','}', '[', ']', '<', '>', '(', ')']

def createCorrect(l):
    if (l%2 == 1): l += 1
    expression = []
    for x in xrange(l/2):
        toinsert = random.randint(0, len(expression))
        index = random.randint(0,3)
        expression.insert(toinsert, bracket2[index])
        expression.insert(toinsert, bracket1[index])
    return expression

for x in xrange(N):
    expr = random.randint(70,100)
    if random.randint(1,2) == 1:
        exxpr = [brackets[random.randint(0,7)] for x in xrange(expr)]
    else:
        exxpr = createCorrect(expr)
    print ''.join(exxpr)
