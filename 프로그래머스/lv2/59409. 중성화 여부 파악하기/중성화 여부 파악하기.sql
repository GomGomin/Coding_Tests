-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME,
    case
        WHEN SEX_UPON_INTAKE LIKE "%Neutered%" THEN 'O'
        WHEN SEX_UPON_INTAKE LIKE "%Spayed%" THEN 'O'
        ELSE 'X'
    end as '중성화'
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
