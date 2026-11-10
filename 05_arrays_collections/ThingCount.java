
	public class ThingCount implements Comparable
	{
		private int count;
		private Object thing;
		
		public ThingCount()
		{
			count=0;
			thing=null;
		}
		
		public ThingCount(Object thang, int cnt)
		{
			thing=thang;
			count=cnt;
		}
		
		public int getCount()
		{
			return count;
		}
		
		public void setCount(int cnt)
		{
			count=cnt;
		}

		public void setThing(Object obj)
		{
			thing=obj;
		}	
		
		public Object getThing()
		{
			return thing;
		}
		
		public boolean equals(Object obj)
		{
			if(count==((ThingCount)obj).getCount()) {
				return true;
			}
			return false;
		}
		
		public int compareTo(Object obj)
		{
			if(this.getThing().getClass().isInstance(obj)) {
				return 0;
			}
			return 1;
					
		}
		
		public String toString()
		{
			return ""+ getThing() + " - " + getCount()+" ";
		}
		
	}

