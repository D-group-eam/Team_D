-- 1page
SELECT * FROM test_mall_order
WHERE mem_nickname='nickname0'
Limit 0,5;

-- 2page
SELECT * FROM test_mall_order
WHERE mem_nickname='nickname0'
Limit 5,5;


