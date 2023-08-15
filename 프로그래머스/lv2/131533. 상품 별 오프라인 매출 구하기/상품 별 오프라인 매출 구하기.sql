SELECT p.PRODUCT_CODE, (SUM(o.SALES_AMOUNT) * PRICE) as SALES
FROM PRODUCT p,OFFLINE_SALE o
WHERE p.PRODUCT_ID = o.PRODUCT_ID
GROUP BY p.PRODUCT_CODE
ORDER BY SALES DESC, p.PRODUCT_CODE