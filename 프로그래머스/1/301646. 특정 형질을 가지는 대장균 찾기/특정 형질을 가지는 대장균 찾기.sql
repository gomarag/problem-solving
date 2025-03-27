-- 코드를 작성해주세요 
# 2번 형질 x, 1 또는 3 보유 = 2를 반드시 보유 + 1과 3 보유x -> 1010, 0010
SELECT COUNT(*) AS count
FROM ECOLI_DATA
WHERE (GENOTYPE & 2) = 0
  AND ((GENOTYPE & 1) <> 0 OR (GENOTYPE & 4) <> 0);


