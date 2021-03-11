package com.javarush.task.task19.task1901;

/* 
TableAdapter
*/

public class Solution
{
    public static void main(String[] args)
    {
        //это пример вывода
        ATable aTable = new ATable()
        {
            @Override
            public String getCurrentUserName()
            {
                return "Amigo";
            }

            @Override
            public String getTableName()
            {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable
    {
        public TableAdapter(ATable aTable)
        {
        }

        @Override
        public String getHeaderText() {
            return null;
        }
    }

    public interface ATable
    {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable
    {
        String getHeaderText();
    }
}