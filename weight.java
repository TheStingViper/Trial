
public class weight {

		//instance variables
		private
		int kg;
		int gm,m;
		
		//setters
		void setkg(int nm){
			kg=nm;
		}
		void setg(int ad){
			gm=ad;
		}
		
		//getters
		int kr(){return kg;}
		int gr(){return gm;}
		
		//business logic(Any method other than setters and getters)
		weight total(weight q){
			weight w = new weight();
			w.gm=gm+q.gm;
			if(w.gm>1000){
				m=w.gm/1000;
				w.kg=m;
				w.gm=w.gm%1000;
			}
			w.kg=w.kg+kg+q.kg;
			return w;
		
			}
	}
