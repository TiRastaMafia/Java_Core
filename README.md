# Java_Core

            Урок 1. Компиляция и интерпретация кода
           
    1.  Создать проект из трёх+ классов (основной с точкой входа и два класса в другом пакете),
        которые вместе должны составлять одну программу (простое приложение на Ваш выбор), которое просто 
        демонстрирует работу некоторого механизма).
    2.  Необходимо установить Docker Desktop.
    
   Решение тут _[HW1](https://github.com/TiRastaMafia/Java_Core/tree/main/HW1)_
   
           Урок 2. Данные и функции

    1. Написать метод, возвращающий количество чётных элементов массива. 
       countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0 
    2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного
       не пустого массива. 
    3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента,
       с нулевым значением.


  Решение тут _[HW2](https://github.com/TiRastaMafia/Java_Core/tree/main/HW2)_
  
           Урок 3. Классы и объекты

    1. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты 
       (сделать статическим) в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять 
       заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите 
       его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата 
       руководителя не повысилась. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 
       3 countEvens([1, 3, 5]) → 0 
    2* Сделать компараторы для Сотрудников на основе ЗП и Возраста
     
  Решение тут _[HW3](https://github.com/TiRastaMafia/Java_Core/tree/main/HW3)_

           Урок 4. Обработка исключений

    1.  Реализовать логику приложения Магазин из описания к уроку.  
    2.  Добавить перечисление с гендерами. В класс покупателя добавить свойство «пол» со значением 
        созданного перечисления. Добавить геттеры, сеттеры.
    3.  Добавить в приложение Магазин учет цены товара - в Заказ добавить поле стоимость. Добавить 
        перечисление с размерами скидок - 0, 5, 10, 15, 20%.
        Написать метод, при вызове которого на переданный тип товара незначается рандомная скидка 
        из перечисления (меняем значение поля price)
    4** Товарам добавить категорию. Задать категории Стандарт и Премиум. Если на товар категории Премиум 
        назначилась скидка более 15%, выбросить исключение TooMuchSaleException(msg), сообщение с ошибкой 
        вывести в консоль, цену товара не менять.
     
  Решение тут _[HW4](https://github.com/TiRastaMafia/Java_Core/tree/main/HW4)_  

           Урок 5. Тонкости работы

    1. Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь 
       созданную папку ./backup
    2. Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой,
       например, состояния ячеек поля для игры в крестики-нолики, где 0 – это пустое поле, 1 – это поле с крестиком,
       2 – это поле с ноликом, 3 – резервное значение. Такое предположение позволит хранить в одном числе 
       типа int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.
    3* В продолжение 2 дописать "разворачивание" поля игры крестики-нолики из сохраненного в файле состояния 
       (распарсить файл, в зависимости от значений (0-3) нарисовать поле со значками 'х' 'о' '.')
     
  Решение тут _[HW5](https://github.com/TiRastaMafia/Java_Core/tree/main/HW5)_  
  
  


