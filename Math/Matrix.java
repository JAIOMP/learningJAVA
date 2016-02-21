class Matrix {
	int matrix[][];
	int row,column,count=0;
	
	public Matrix(int row,int column){
		this.row = row;
		this.column = column;
		this.matrix = new int[this.row][this.column];
	}

	public void populate(int[] input){
		for (int i=0;i<this.row ;i++ ) {
			for (int j=0;j<this.column;j++) {
				this.matrix[i][j] = input[count];
				count++;
			}
		}
	}

	public Matrix add(Matrix first){
		Matrix destination = new Matrix(this.row,this.column);
		for (int i=0;i<first.row;i++) {
			for (int j=0;j<first.column;j++) {
				destination.matrix[i][j] = this.matrix[i][j]+first.matrix[i][j];				
			}
		}
		return destination;
	}

	public Matrix multiply(Matrix first){
		Matrix destination = new Matrix(this.row,this.column);
		for (int i = 0; i < first.row; i++) {
           for (int j = 0; j < this.column; j++) {
               for (int k = 0; k < first.column; k++) {
                   destination.matrix[i][j] += first.matrix[i][k] * this.matrix[k][j];
               }
           }
       }
       return destination;
	}

	public int determinant(int A[][],int N){
        int det=0;
        if(N == 1)
        {
            det = A[0][0];
        }
        else if (N == 2)
        {
            det = A[0][0]*A[1][1] - A[1][0]*A[0][1];
        }
        else
        {
            det=0;
            for(int j1=0;j1<N;j1++)
            {
                int[][] m = new int[N-1][];
                for(int k=0;k<(N-1);k++)
                {
                    m[k] = new int[N-1];
                }
                for(int i=1;i<N;i++)
                {
                    int j2=0;
                    for(int j=0;j<N;j++)
                    {
                        if(j == j1)
                            continue;
                        m[i-1][j2] = A[i][j];
                        j2++;
                    }
                }
                det += Math.pow(-1.0,1.0+j1+1.0)* A[0][j1] * determinant(m,N-1);
            }
        }
        return det;
    }
    

}